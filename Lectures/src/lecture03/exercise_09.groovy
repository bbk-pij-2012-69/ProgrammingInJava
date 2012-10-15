package lecture03
java.util.Scanner sc = new java.util.Scanner(System.in);
print "Please enter you string: "
String original_line = sc.nextLine().toString()
StringBuilder sb = new StringBuilder()

for(def i = 0; i < original_line.length(); ++i)
{
    char character = original_line.charAt(i)
    if(character.isLetter())
    {
        sb.append(character)
    }
}
String line = sb.toString().toLowerCase()

palindrom = false

if(line.size() % 2 == 1)
{
    int half = (line.size() / 2) + 1 
    StringBuilder stringBuilder = new StringBuilder(line.substring(0,half))

    String reverse = stringBuilder.reverse().toString()
    String sub = line.substring(half - 1 ,line.size()).toString()
    if (sub.equals(reverse))
    {
        palindrom = true
    }
}
else
{
    int half = line.size() / 2
    StringBuilder stringBuilder = new StringBuilder(line.substring(0,half))
    
    String reverse = stringBuilder.reverse().toString()
    String sub = line.substring(half,line.size()).toString()
    if (sub.equals(reverse))
    {
        palindrom = true
    }
}

if (palindrom)
    println original_line + " IS a relaxed palindrome."
else
    println original_line + " is NOT a relaxed palindrome."
