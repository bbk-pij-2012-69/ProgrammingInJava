package lecture01

// Example 4 - Prime numbers
print "Please enter a number: "
int i = Integer.parseInt(System.console().readLine()), count = 2
boolean prime = true
while(count < i)
{
    if(i % count == 0){
        prime = false
        break
    }
    count++
}

println "Your number is " + ((prime) ? "" : "NOT ") + "a prime number!"
