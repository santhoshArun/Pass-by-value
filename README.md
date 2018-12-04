<h3>Java is pass by value or likely passing reference as a value</h3>
First we need to understand there is a differnce between call by value and calling reference as a value.<br>
C is call by value and Java is calling reference as a value.<br>
Here we have used a swap function that swaps the value given to it and we are passing two things, one is a normal variable and the other instance of the class(reference type).<br>
The normal variable remains unaffected and we don't need this here.<br>
First we use setval() function that sets the value of the current instance with the help of reference, here it is using the reference and changing the value and not changing the reference variable itself.<br>
So if we tried to change the reference variable like d = new demo(30); the variable remains unaffected.<br>
Thus it is proved that we can't change the referece variable, we can use the reference or instance to alter the other values.<br>
So java is call by value or calling reference as a value.
