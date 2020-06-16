# sleeping-barber-concurrency
Mutual exclusion during thread concurrency with the classic barber shop paradigm.

Using wait() and notify() functions, the mutual exclusion is achieved throughout a virtual barber shop.
Only 4 customers (threads) can sit in the waiting room. At that time, the others wait outside inactive but ready to come in.
The barber can cut one person's hair at the time and needs some time to rest from time to time.
He also waits when there's no work to be done.

The graphics are courtesy of Kleanthis Thramboulidis and cannot be redistributed.
