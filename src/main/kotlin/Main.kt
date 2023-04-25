fun main() {
    println(stringName("Margaret"))
var currentAccount = CurrentAccount(45786,"JohnTradings",37899)
    currentAccount.deposit(7000.0)
    currentAccount.details()
    currentAccount.withdraw(3000.0)
}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun stringName(name: String): Char{
    var names = name
    return names[0]

//    return names.length[-1]

}

//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false

//fun pass(password: String): Boolean{
//    var password = "morendren"
//    if (password >= 8 && password < 16 && password ){
//
//    }
//}

//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”

fun multiples(nums){
    for(num in nums){
        if(num % 6 == 0 && num % 8 == 0 )
    }
}

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”

open class CurrentAccount(var accountNumber: Int,var accountName: String,var balance: Int){
    fun deposit(amount: Double): Double{
        var totalAmount = amount
        return totalAmount
    }
    fun withdraw(amount: Double): Double{
        var remainingBalance = amount
        return remainingBalance

    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName ")
    }


}
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

class SavingsAccount(var accountNumber: Int,var accountName: String,var balance: Int) {


    fun withdraw(amount: Double): Double {
        var remainingBalance = amount
        return remainingBalance
    }
}

