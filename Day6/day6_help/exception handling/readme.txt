Exception Handling


Regarding Exception Handling in java.....
Any run time err occurs(eg file not found,accessing out of array size,accessing func from null ref, divide by 0)
---JRE(main thrd) --- creates matching exc class instance(java.io.FileNotFoundException,java.lang.ArrayOutOfBoundsExc,NullPointerExc,ArithmeticExc)
--- JRE checks -- if prog has proivided exc handling code ?
--- NO -- JRE aborts java code(by supplying def handler) & prints details --F.Q exc class name,reason behind failure & location details(err stack trace

--- YES (try---catch) JRE execs exc handling block & continues with the rest of the code.



syntax(key words) --- try,catch,finally,throw,throws
Inheritance hierarchy of exc classes
unchecked vs checked excs.
Creating custom excs
JDK 1.7 syntax --- try-with-resources(in I/O or device prog)



Checked & Unchked exc are detected or occur only in run-time
JRE DOES NOT distinguish between them
Compiler(javac) differentiates bet them
Javac forces handling of the checked exc. upon the prog.(Handling by supplying matching try-catch block or including it in the throws clause.)

Legal syntax
1. try {...} catch (exc1 e){...}
2. try {...} catch (exc1 e){} catch (exc2 e) {} ....
3. try {...} catch (exc1 e){} catch (exc2 e) {}catch(Exception e){catch-all}
3.5 3. try {...} catch (exc1 e){} catch (exc2 | exc3 e) {}catch(Exception e){catch-all}
4. throws syntax ---
method declaration throws comma separated list of exc classes.
eg : Integer class API
public static int parseInt(String s) throws NFE
FileReader API
public FileReader(String fileName) throws FNFE

throws --- meant for javac
Meaning -- Method MAY raise specified exc.
Current method is NOT handling it , BUT its caller should handle.
Mandatory--- only in case of un handled chked excs.
Use case --used in delegating the exception to caller.

4.5 Throwable class API
 
1. public String toString() -- rets Name of exc class & reason.
2. public String getMessage() -- rets error mesg of exception
3. public void printStackTrace() --- Displays name of exc class, reason, location dtls.


5. finally --- keyword in exc handling
finally -- block -- finally block ALWAYS survives(except System.exit(0))
i.e in the presence or absence of excs.
5.1 try{...} catch (Exception e){....} finally {....}
5.2 try{...} catch (NullPointerException e){....} finally {....}
5.3 try {...} finally {....}

try-with-resources
From Java SE 7 onwards --- Java has introduced java.lang.AutoCloseable -- i/f
It represents --- resources that must be closed -- when no longer required.
Autocloesable i/f method
public void close() throws Exception-- closing resources.

Java I/O  classes(eg : BufferedReader,PrintWriter),Scanner -- have already implemented this i/f -- to automatically close resource when no longer required.

syntax of try-with-resources
try (//can open one or multiple AutoCloseable resources)
{ ......
} catch(Exception e)
{
}







Creating Custom Exc(User defined exception or application exc)
1. Create a pkged public class which extends Throwable(not reco but legal)/Exception(recommended)/Error(not reco but legal)/RuntimeExc(not reco but legal)

2.CustExc(String msg) : overload the constr : to invoke the super-class constr.
of the form 
Exception (String msg)
OR  
CustExc(String msg,Throwable rootCause)
public Exception(String message,Throwable cause)


Objective :
Check the speed of vehicle on a freeway
Accept the speed using Scanner : can be speed too low(exc) or too high(exc) or in range


keyword -- throw --for throwing user define exc.
syntax :
throw Throwable instance;
throw new NullPointerExc();
throw new InterruptedExc();
throw new Throwable("abc");
throw new Account(...);//javac err
throw new AccountOverdrawnExc("funds too low...");
