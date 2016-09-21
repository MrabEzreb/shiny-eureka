//import org.scalatest.WordSpec
//import mrabezreb.scalajsthingy.Main
//import org.scalajs.jquery.jQuery
//
//
//class BigRedButtonSpec extends WordSpec {
//  
//  override def withFixture(test: NoArgTest) = {
//    try test()
//    finally {
//      
//    }
//  }
//  Main.setupUI()
//  
//  "Big Red Button App" can {
//    
//    "setup" should {
//      
//      "Have helloworld" in {
//        assert(jQuery("p:contains('Hello, World!')").length == 1 )
//      }
//      
//      "Have button" in {
//        assert(jQuery("button").length == 1)
//      }
//      
//    }
//    
//    "press button" should {
//      val button = jQuery("button")
//      
//      "display a text" in {
//        def messageCount = jQuery("p:contains('boom')").length
//        
//        assert(button.length == 1)
//        assert(messageCount == 0)
//        
//        for (c <- 1 to 5) {
//          button.click()
//          assert(messageCount == c)
//        }
//      }
//    }
//  }
//  
//}