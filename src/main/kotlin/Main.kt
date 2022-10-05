import java.lang.IllegalArgumentException

fun main() {
    //Asks if the user is a company or just a resident
    println("Welcome to Victor's Lawn Maintenance Co. If you represent a company, type 1 and press enter" +
            ". If you are a resident, type 2 and press enter: ")

    if (readLine()!!.toInt() == 1){
        //Prompts the user to enter basic information about themselves and their property

        print("Please enter your name: ") //Name
        val name = readLine().toString()
        println()

        print("Please enter your phone number. Make sure to include dashes: ") //phone number
        val phoneNum = readLine().toString()
        println()

        print("Please enter your street address. Do not include your city or zip code: ") //address
        val address = readLine().toString()
        println()

        print("Please enter your properties square footage: ") //square footage
        var squareFootage: Double = readLine()!!.toDouble()
        if (squareFootage <= 0.0) { //if statement to throw an error if the square footage is illogical
            throw IllegalArgumentException("Zero Square Feet is an Invalid Input")
        }
        println()

        print("Please enter the name of your property: ") //property name
        val propertyName = readLine().toString()
        println()

        print("Finally, please enter the number of properties you want us to service: ") //number of properties
        var numProperties: Int = readLine()!!.toInt()
        if (numProperties <= 0){ //if statement to throw an error if the property count is illogical
            throw IllegalArgumentException("Zero Properties is an Invalid Input")
        }
        println()

        //declares commercial object, passes parameters, and calculates the weekly charge
        val commercial = Commercial(propertyName, numProperties, name, phoneNum, address, squareFootage)
        commercial.weeklyCharge()

    } else if (readLine()!!.toInt() == 2){
        print("Please enter your name: ") //name
        val name = readLine().toString()
        println()

        print("Please enter your phone number. Make sure to include dashes: ") //phone number
        val phoneNum = readLine().toString()
        println()

        print("Please enter your street address. Do not include your city or zip code: ") //address
        val address = readLine().toString()
        println()

        print("Please enter your properties square footage: ") //square footage
        var squareFootage: Double = readLine()!!.toDouble()
        if (squareFootage <= 0.0) { //if statement to throw an error if the square footage is illogical
            throw IllegalArgumentException("Zero Square Feet is an Invalid Input")
        }
        println()

        print("Please enter the name of your property: ") //property name
        val propertyName = readLine().toString()
        println()

        print("Are you over the age of 65? If you are, type yes and press enter. If you are not, type no and press enter: ")
        var isSenior: Boolean = false
        if (readLine()!!.lowercase().toString() == "yes"){
            isSenior = true
        }
        println()

        //declares residential object, passes parameters, and calculates the weekly charge
        val residential = Residential(propertyName, isSenior, name, phoneNum, address, squareFootage)
        residential.weeklyCharge()
    } else {
        //failsafe in case the user did not enter 1 or 2 initially
        println("You did not enter the numbers 1 or 2. Please try again.")
    }
}