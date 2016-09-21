import org.scalatest.FeatureSpec
import org.scalatest.GivenWhenThen
import org.scalajs.jquery.jQuery
import mrabezreb.scalajsthingy.Main
import org.scalatest.Matchers

class HomepageSpec extends FeatureSpec with GivenWhenThen with Matchers {
  
  scenario("User loads the webpage") {
    Given("An empty page")
    jQuery("body").children().length should be (0)
    When("Javascript runs")
    Main.setupUI()
    Then("there should be Helloworld")
    jQuery("p:contains('Hello, World!')").length should be (1)
    And("there should be a button")
    jQuery("button").length should be (1)
  }
  feature("Big Red Button") {
    scenario("User Presses Big Red Button") {
      Given("There is no booming")
      def messageCount = jQuery("p:contains('boom')").length
      messageCount should be (0)
      When("The button is pressed")
      jQuery("button").click()
      Then("It should make you go boom")
      messageCount should be (1)
    }
  }
}