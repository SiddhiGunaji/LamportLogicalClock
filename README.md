# LamportLogicalClock

## Introduction

Lamport’s Logical Clock was created by Leslie Lamport. It is a procedure to determine the order of events occurring. 

It provides a basis for the more advanced Vector Clock Algorithm. Due to the absence of a Global Clock in a Distributed Operating System Lamport Logical Clock is needed.

Lamport's logical clock is a mechanism for assigning timestamps to events in a distributed system in a way that partially orders the events. The idea behind the logical clock is to assign a timestamp to each event in the system, such that the timestamp reflects the causal relationship between events.

The basic idea is that each process in the system maintains its own logical clock, which it increments each time it performs an event. When a process sends a message to another process, it includes its current logical clock value in the message. The receiving process then updates its own logical clock to be greater than the maximum of its current value and the value received in the message before it performs the event associated with the message.

This way, the logical clock values assigned to events reflect the causal order of the events. If event A happens before event B, then the logical clock value of event A will be less than the logical clock value of event B.


## Algorithm

•	Happened before relation(->): a -> b, means ‘a’ happened before ‘b’.

•	Logical Clock: The criteria for the logical clocks are:
*	[C1]: Ci (a) < Ci(b), [Ci -> Logical Clock, If ‘a’ happened before ‘b’, then time of ‘a’ will be less than ‘b’ in a particular process.]
*	[C2]: Ci(a) < Cj(b), [Clock value of Ci(a) is less than Cj(b)]
