package hw_13;

import hw_13.dto.CategoryDto;
import hw_13.dto.PetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PutPetTests {

    @Test
    public void verifyPetCanBeModified() {

        int petIdToCreate = 302;
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
        Assert.assertEquals(categoryDto.getName(), previouslyCreatedPetDto.getCategory().getName());
        Assert.assertEquals(petNameToCreate, previouslyCreatedPetDto.getName());
        Assert.assertEquals(status, previouslyCreatedPetDto.getStatus());

        String updatePetName = "Lara";
        String updateStatus = "not_available";

        petDtoToCreate.setName(updatePetName);
        petDtoToCreate.setStatus(updateStatus);
        categoryDto.setName("Bull");

        Response putPetResponse = given().contentType("application/json")
                .body(petDtoToCreate)
                .put("https://petstore.swagger.io/v2/pet");

        Response afterPutPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        PetDto previouslyPutPetDto = afterPutPetResponse.as(PetDto.class);

        Assert.assertEquals(updatePetName, previouslyPutPetDto.getName());
        Assert.assertEquals(updateStatus, previouslyPutPetDto.getStatus());
        Assert.assertEquals(categoryDto.getName(), previouslyPutPetDto.getCategory().getName());
    }
}
