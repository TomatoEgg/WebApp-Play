package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.Quote
import play.api.http.HttpEntity

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() extends Controller {
  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  var index = Action {
    Ok(views.html.index("Your new application is ready.", 
        Quote("Citer les pensees des autres, c'est regretter de ne pas les avoir trouvees soi-meme.",
              "Sacha Guitry")))
  }

  index = Action {
    Redirect("/count")
  }
}
