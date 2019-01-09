package fun;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutSteps {
	int bananaPrice = 0;
	Checkout checkout;
	
	public CheckoutSteps() {
		checkout = new Checkout();
	}
	
	@Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
	public void thePriceOfAIsC(String name, int price) throws Throwable {
	    bananaPrice = price;
	}

	@When("^I checkout (\\d+) \"([^\"]*)\"$")
	public void iCheckout(int itemCount, String name) throws Throwable {
		checkout.add(itemCount, bananaPrice);
	}

	@Then("^the total price should be (\\d+)c$")
	public void theTotalPriceShouldBeC(int total) throws Throwable {
	    Assert.assertEquals(total, checkout.total());
	}
}
