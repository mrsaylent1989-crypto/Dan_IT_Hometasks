package data_provider;


import org.testng.annotations.DataProvider;

public class ProvideData {
    @DataProvider
    public Object [][] getSearchData(){
        return new Object[][]{
                {"iPhone","iPhone"}
        };
    }
}
