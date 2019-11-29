package com.spartaglobal.cucumberIntroduction.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IntroductionStepDefs {

    @Given("I am a first time user of cucumber")
    public void i_am_a_first_time_user_of_cucumber() {
        System.out.println("Here is my given clause");
    }

    @And("I find cucumber interesting")
    public void i_find_cucumber_interesting() {
        System.out.println("I have added an 'and'");
    }

    @When("I execute this script")
    public void i_execute_this_script() {
        System.out.println("Here is my given clause");
    }

    @Then("I will hopefully understand more about cucumber")
    public void i_will_hopefully_understand_more_about_cucumber() {
        System.out.println("Here is my given clause");
    }

//    Next Scenario

    @Given("I have an Integer of {int}")
    public void i_have_an_Integer_of(Integer int1) {
    System.out.println(int1);
    }

    @Then("I am able to print it")
    public void i_am_able_to_print_it() {
        System.out.println("wow my int is printed");
    }

//    Next Scenario
    @Given("I have a float\\/double {double}")
    public void i_have_a_float_double(Double double1) {
        System.out.println(double1);
    }

    @Then("I can print this as well")
    public void i_can_print_this_as_well() {
        System.out.println("wow my double is printing");
    }

//    Next Scenario

    @Given("I have the fruit {word}")
    public void i_have_the_fruit_banana(String fruit) {
        System.out.println(fruit);
    }

    @Then("I have to eat it nom nomm nomm")
    public void i_have_to_eat_it_nom_nomm_nomm() {
        System.out.println("wow my string is printed");
    }

//  Next Scenario

    @Given("I have {int} {word}")
    public void i_have_24_banana(int int1, String fruit) {
        System.out.println(int1 +" "+ fruit);
    }

    @Then("I have to eat it nom nomm")
    public void i_have_to_eat_it_nom_nomm() {
        System.out.println("wow my string is printed");
    }
}