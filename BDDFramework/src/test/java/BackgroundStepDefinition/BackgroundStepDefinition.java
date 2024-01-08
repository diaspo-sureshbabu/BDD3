
  package BackgroundStepDefinition;
  
  import io.cucumber.java.en.And; import io.cucumber.java.en.Given; import
  io.cucumber.java.en.Then; import io.cucumber.java.en.When;
  
  public class BackgroundStepDefinition {
  
  @Given("I want to write a step with precondition") public void
  i_want_to_write_a_step_with_precondition() { }
  
  @And("some other precondition") public void some_other_precondition() { }
  
  @When("I complete action") public void i_complete_action() { }
  
  @And("some other action") public void some_other_action() { }
  
  @Then("first validate the outcomes") public void
  first_validate_the_outcomes() { }
  
  @And("check more outcomes1") public void check_more_outcomes1() { }
  
  @Then("second validation") public void second_validation() { }
  
  @And("check more outcomes2") public void check_more_outcomes2() { }
  
  }
 