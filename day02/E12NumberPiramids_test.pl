#!/usr/bin/perl
# test script for java E12NumberPiramids run by
# ./E12NumberPiramids_test.pl > E12NumberPiramids_test.txt
print("output of $0 test script\n\n");
@commands= ( "java E12NumberPiramids", 
	     "java E12NumberPiramids 15",
	     "java E12NumberPiramids produceERRORonParse",
	     "java E12NumberPiramids 15 produceERRORmultipleArgs " );
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
