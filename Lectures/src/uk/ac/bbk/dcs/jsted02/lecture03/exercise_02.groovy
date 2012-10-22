package lecture03
def var1, var2, operation
def result = null

if(args.size() == 3)
{
    var1 = args[0] as double
    operation = args[1] as String
    var2 = args[2] as double
}
else if(args.size() == 1)
{
    if(args[0].contains("+")){
        operation = "+"
    }
    else if(args[0].contains("-")){
        operation = "-"
    }
    else if(args[0].contains("*")){
        operation = "*"
    }
    else if(args[0].contains("/")){
        operation = "/"
    }
    else{
        println "Unhandled case!"
        System.exit(1)
    }
        
    def values = args[0].split("\\"+operation)
    var1 = values[0] as double
    var2 = values[1] as double
}
else{
    println "Unhandled case!"
    System.exit(1)
}



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
