package com.interview.hotstar;


import java.util.HashSet;

public class RoundOne {

    public static void main(String[] args) {


//        Remove the duplicates = { Java , C , java , Python , php , ruby , c }

        String str = " Java , C , java , Python , php , ruby , c ";

        HashSet hashSet = new HashSet<>();

        for(String strValue:str.split(",")){
            hashSet.add(strValue.trim().toLowerCase());
        }

        System.out.println("Printing the value:"+ hashSet);

    }



    // Update Table <tableName> set <Column_Name> = <value> where <Column_Name> = condition;
    // Select dis

    /*Write a code to Launch browser
    enter name and pwd
    Click on submit
    T&C alert box will popup - click on "ok"
    select check box of T&C
    click on submit and fetch the title ?*/


    /* WedDriverManger


    WebDriver driver  = new ChromeDriver();
    driver.get("")


    @FindBy()
    WebElement name

    Assert.assertEquals(name.enterText())
    pwd.enterText(
    sumbit.click(



    boolean enterText(Webelement elemenet, String value){

    explicit wait

    try{
    element.sendkeys(Value)
    return true;
    }
    catch(){
        return false;
    }


    }




     */




}
