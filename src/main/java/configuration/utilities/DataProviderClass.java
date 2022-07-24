package configuration.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
//TestNg have another type of approach that is called data provider
    @DataProvider(name = "LogInInformation")
    public static Object[][] logInData(){
        return new Object[][]{
                {"OoompaLoompa","awwNoIDidItAgain"},//first username,second password
                {"OhSnap","lifeManJustLife"},
                {"HereWeGoAgain","INeedMotivation"},
        };
    }

    @DataProvider(name = "RegistrationDataFromExcel1")//name means file name
    public static Object[][] getRegistrationDataFromExcel() {
        return ReadExcelDataDrivenApproach.getRegistrationTestData("AccountInfo");
    }

}
