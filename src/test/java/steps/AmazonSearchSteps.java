package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AmazonSearchSteps extends StepsBase{

    @Given("The user navigate to www.amazom.com")
    public void theUserNavigateToWwwAmazomCom() {
        amazonSearchPage.navigateToAmazon();
    }

    @When("Searches for {string}")
    public void searchesFor(String product) {
        amazonSearchPage.enterSearchCriteria(product);
        amazonSearchPage.clickSearch();
    }

    @And("Navigates to the third page")
    public void navigatesToTheThirdPage() {
        amazonSearchPage.goToThirdPage(3);
    }

    @And("Select the second item")
    public void selectTheSecondItem() {
        
    }

    @Then("The user is able to add it to the cart")
    public void theUserIsAbleToAddItToTheCart() {
        
    }


}