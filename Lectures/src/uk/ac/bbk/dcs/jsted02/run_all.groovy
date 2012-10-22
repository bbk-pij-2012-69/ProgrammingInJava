package uk.ac.bbk.dcs.jsted02
import static uk.ac.bbk.dcs.jsted02.utils.UsefulFunctions.*

if(args.size() == 0)
{
    modules = readln("No modules in the args, please enter a list of exercises to run (lecturexx.example_yy): ") as String
}
else
{
    modules = args
}

modules_list = modules.split(" ")

for(def j = 0; j < modules_list.size(); ++j)
{
    print modules_list[j]
}



