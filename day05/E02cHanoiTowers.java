/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date   from 30 Oct 2014
 *  
 * Day 5 Exercise 2c Hanoi towers
 *
 * task set:
 *	A legend says that, somewhere in the East, near Hanoi, there is
 *	a temple. In the temple, there are three posts. In the posts,
 *	there are 64 discs of 64 different sizes. When the world was
 *	created, all the discs were in the first post; when all the
 *	discs are moved to the last post, the world will end.
 *	
 *	The monks in the temple move the discs between posts, but they
 *	must obey two simple rules. First, only one disc can be moved
 *	at a time, from one post to another post (it cannot be left
 *	anywhere else). Last, but not least, a disc can only be placed
 *	on top of a bigger disc, never on top of a smaller disc. The
 *	smallest disc can be placed on any post (all other discs are
 *	bigger); the biggest disc can only be placed on an empty post.
 *	
 *	Create a method that calculates the number of moves necessary
 *	to move a set of n Hanoi disks from the initial post to the
 *	last post.
 * 
 * Initial thoughts
 *
 * By hand 
 *	n = 1 requires 1 move
 *	n = 2 requires 3 moves = 2*1 + 1
 *	n = 3 requires 7 moves = 2*3 + 1
 *	n = 4 requires 15 moves = 2*7 + 1
 * So moves(N) = 2*moves(N-1) + 1
 *
 * Or moves = (2^N)-1
 * 
 * Meant to do recursively
 */
