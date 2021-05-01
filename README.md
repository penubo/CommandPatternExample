# What is Command Pattern?

Commmand Pattern abstracts `commands` so that we don't need to modify command requester's code
when we modified command executor's code or added new one.

The command pattern has four actors (terms) `command`, `client`, `invoker`, `receiver`.

 * **command**:
The command actor provides interface to the `invoker`. Concrete implemented class of each command has `receiver`
and it refers their function inside it.

 * **client**:
The client is like controller of this command pattern. It is responsible to **map** invoker and proper command.
Also it should decide when `invoker` requests certain command at some proper moment.

 * **invoker**:
The invoker is **requester** who is responsible to request command to the `receiver`.
The beauty of command pattern is that `invoker` doesn't know about concrete `receiver` to request a command.
This is **inversion of control** and can be achieved in java using Interface `Command` in this example.

 * **receiver**:
The receiver is **executor** who is responsible to execute requested command from the `invoker`.
In fact, receiver is invoked by the **concrete Command class**. Note that we don't need to recompile or
modify `invoker` actor when we modified `receiver` actor or add other.

# Project Structure

This project has three packages. I separated them by **actors** of the command pattern.
Note that `Main` class is the `client` actor.
