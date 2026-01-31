package hw_13;

import hw_13.dto.CategoryDto;
import hw_13.dto.notFoundPetDto;
import hw_13.dto.PetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeletePetTests {

    @Test
    public void verifyPetCanBeRemoved(){
        int petIdToCreate = 303;
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName("Wolf");
        String petNameToCreate = "Jess";
        String status = "available";


        PetDto petDtoToCreate = new PetDto(petIdToCreate, categoryDto, petNameToCreate, status);

        Response createPetResponce = given().contentType("application/json")
                .body(petDtoToCreate)
                .post("https://petstore.swagger.io/v2/pet");
        PetDto postResponceDto = createPetResponce.as(PetDto.class);

        Assert.assertEquals(petIdToCreate, postResponceDto.getId());

        Response previouslyCreatePetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        PetDto previouslyCreatedPetDto = previouslyCreatePetResponse.as(PetDto.class);

        Assert.assertEquals(petIdToCreate, previouslyCreatedPetDto.getId());

        given().delete("https://petstore.swagger.io/v2/pet/" + petIdToCreate);

        Response deletedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);

        Assert.assertEquals(404, deletedPetResponse.getStatusCode());
        notFoundPetDto notFoundPetDto = deletedPetResponse.as(notFoundPetDto.class);
        Assert.assertEquals("error", notFoundPetDto.getType());
        Assert.assertEquals("Pet not found", notFoundPetDto.getMessage());
        Assert.assertEquals(1, notFoundPetDto.getCode());
    }
}
