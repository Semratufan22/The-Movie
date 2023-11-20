package org.example.test;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MySteps {
    WebDriver webDriver = new FirefoxDriver();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage(){
        webDriver.get("https://www.themoviedb.org/movie/");
    }
    @Given("There is a menu option Movies")
    public void there_is_a_menu_option_movies(){

    }
    @When ("I go navigate to Movies")
    public void i_go_navigate_to_movies(){
        WebElement moviesLink = webDriver.findElement(By.id("Movies"));
        assertEquals("Movies", moviesLink.getText());
    }
    @Then ("The second item should be Now Playing")
        public void theSecondItemShouldBe(){
        WebElement firstProblem = webDriver.findElement(By.cssSelector(<title>Now Playing Movies — The Movie Database
                (TMDB)</title>));

        Assertions.assertEquals("Now Playing Movies\n" firstProblem.getText());

        }
        @After
    public void CleanUp(){
        webDriver.close();
        }
}
