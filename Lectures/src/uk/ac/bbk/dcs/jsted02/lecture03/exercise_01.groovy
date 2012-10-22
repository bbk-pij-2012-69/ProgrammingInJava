package lecture02
java.util.Scanner sc = new java.util.Scanner(System.in);


print "Please enter your first number: "
def var1 = sc.next().toString() as double

print "Please enter your second number: "
def var2 = sc.next().toString() as double


println "Please enter operation type:"
println "+"
println "-"
println "/"
println "*"

def operation = sc.next().toString()
def result = null

switch(operation)
{
    case "+":
        result = var1 + var2
        break
    case "-":
        result = var1 - var2
        break
    case "/":
        if(var2 == 0)
        {
            println "Don't be a smart ass!"
            break
        }
        result = var1 / var2
        break
    case "*":
        result = var1 * var2
        break
    default:
        println "Invalid operator!!"
}

if(result != null){
    println "Result: " + result
}



