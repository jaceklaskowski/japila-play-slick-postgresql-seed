package models

import java.sql.Date
import play.api.Play.current
import play.api.db.DB
import slick.driver.PostgresDriver.simple._

case class User(
    id: Int,
    username: String,
    password: String,
    full_name: String,
    email: String,
    gender: String,
    dob: Date,
    joined_date: Date
)

class Users(tag: Tag) extends Table[User](tag, "Users") {
    def id = column[Int]("id")
    def username = column[String]("username", O.PrimaryKey)
    def password = column[String]("password")
    def full_name = column[String]("full_name")
    def email = column[String]("email")
    def gender = column[String]("gender")
    def dob = column[Date]("dob")
    def joined_date = column[Date]("joined_date")
    def * = (id, username, password, full_name, email, gender, dob, joined_date) <> (User.tupled, User.unapply)
}

object Users {

    val users = TableQuery[Users]

    def getAll: List[User] = {
        Database.forDataSource(DB.getDataSource()) withSession { implicit session =>
            users.list
        }
    }
}
