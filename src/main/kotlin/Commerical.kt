import java.lang.IllegalArgumentException

class Commercial (propertyName: String,
                  numProperties: Int,
                  customerName: String,
                  customerPhone: String,
                  customerAddress: String,
                  squareFootage: Double):
    Customer(customerName, customerPhone, customerAddress, squareFootage) { //Variables declared in the Commercial
    //constructor are supered up to Customer in this line

    //Name of Property
    var propertyName: String = propertyName
        get() = field
        set(value) {
            field = value
        }
    //Number of properties, used later to calculate discounts
    var numProperties: Int = numProperties
        get() = field
        set(value) {
            field = value
        }

    //Rate per 1000 square feet
    private val rateForThousand: Double = 5.0


    fun weeklyCharge(): Double{
        if (numProperties <= 0) {
            //Logically impossible to have negative or 0 properties, so an exception is thrown
            throw IllegalArgumentException("Zero Properties is Invalid")
        } else if (numProperties == 1){
            //1 Property means no discount
            print("Customer Name: $customerName \n" +
                    "Customer Phone: $customerPhone \n" +
                    "Customer Address: $customerAddress \n" +
                    "Property Name: $propertyName \n" +
                    "Square Footage: $squareFootage \n" +
                    "Rate Per Thousand Square Feet: $$rateForThousand \n" +
                    "Total Price per Week: $${(squareFootage/1000.0) * rateForThousand}")
            return (squareFootage/1000.0) * 5.0
        } else {
            //Any more than 1 property gets a 10% discount
            print("Customer Name: $customerName \n" +
                    "Customer Phone: $customerPhone \n" +
                    "Customer Address: $customerAddress \n" +
                    "Property Name: $propertyName \n" +
                    "Square Footage: $squareFootage \n" +
                    "Rate Per Thousand Square Feet: $$rateForThousand \n" +
                    "Multiple Property Discount: 10% \n" +
                    "Total Price per Week: $${((squareFootage/1000.0) * rateForThousand) * 0.9}")
            return ((squareFootage/1000.0) * 5.0) * 0.9
        }
    }





}