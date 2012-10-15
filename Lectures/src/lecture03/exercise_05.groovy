package lecture03
java.util.Scanner sc = new java.util.Scanner(System.in);
print "Please enter your short string: "
String short_string = sc.nextLine()
int short_len = short_string.length()

print "Please enter your long string: "
String line = sc.nextLine()
int line_len = line.length()

int sub_count = 0
for(def i = 0; i < line_len; ++i)
{
    String sub = ""
    for(def j = 0; j < short_len; ++j)
    {
        if(i+j < line.length())
        {
            sub += line.charAt(i+j)
        }
    }
    
    if(sub.equals(short_string))
    {
        ++sub_count;
    }
    
}

println sub_count + " instances of " + short_string + " in " + line