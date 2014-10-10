#!/usr/bin/perl
# test script for java E17OptimusPrime run by
# ./E17OptimusPrime_test.pl > E17OptimusPrime_test.txt
print("output of $0 test script\n\n");
@commands= ( "java E17OptimusPrime 5116", 
	     "java E17OptimusPrime 5117",
	     "java E17OptimusPrime 5119",
	     "java E17OptimusPrime -2",
	     "java E17OptimusPrime produceERRORonParse",
	     "java E17OptimusPrime" );
foreach $command (@commands) {
    $tnum++;
    print("\n\n");
    print("test $tnum \"$command\" produces:\n");
    print("********************************\n");
    $istatus = system($command);
    # perl status to get meaningful numbers "shift right by eight"
    # http://perldoc.perl.org/functions/system.html
    $istatus = $istatus >> 8;
    print("********************************\n");
    print("output status=$istatus\n");
}
