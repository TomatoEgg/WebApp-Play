package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class UserController @Inject() extends Controller{
  val userAccount = Map(0 -> "Jack", 1 -> "Jone")
  
  def greetUser(id : Int) = Action {
    Ok(views.html.user(userAccount.get(id)))
  }
}