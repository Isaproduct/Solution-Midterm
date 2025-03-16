Smart Home Control System - Code Explanation
This implementation of a Smart Home Control System follows the principles of multiple design patterns to create a flexible and extensible architecture.

The key design patterns used are:

Composite Pattern - Manages groups of smart devices.
Decorator Pattern - Dynamically extends device functionality (e.g., logging, scheduling).
Abstract Factory Pattern - Provides a factory to create related devices.
Facade Pattern - Simplifies interaction with the entire system.
Adapter Pattern - Integrates legacy or third-party systems.
1. SmartDevice.java (Interface for all Smart Devices)
This is the base interface for all devices in the smart home system.
All smart devices (like lights, thermostats, etc.) implement this interface.

2. Light.java (Concrete Device - Light)
A light is a smart device that can be turned on/off.
Implements the SmartDevice interface and outputs a message when turned on.

3. Thermostat.java (Concrete Device - Thermostat)
Represents a smart thermostat that can adjust temperature.
Implements SmartDevice and can set and display the temperature.

4. SmartHomeComposite.java (Composite Pattern - Group of Devices)
This composite class allows grouping multiple devices (e.g., grouping devices in a room or a floor).
Uses the Composite Pattern to call operate() on all its child devices.

5. DeviceDecorator.java (Base Decorator - Decorator Pattern)
This is the base decorator class.
It wraps a SmartDevice and delegates operate() to it.
Allows dynamic extension of functionalities.

6. LoggingDecorator.java (Adds Logging Feature)
Adds logging to a device.
Logs the operation before calling the original operate().

7. ScheduledOperationDecorator.java (Adds Scheduling Feature)
Adds scheduled execution to any smart device.
Prints the scheduled time before calling operate().

8. SmartHomeFactory.java (Abstract Factory)
Defines a factory interface for creating related smart devices.

9. BasicSmartHomeFactory.java (Factory for Basic Devices)
Creates standard smart home devices.

10. AdvancedSmartHomeFactory.java (Factory for Advanced Devices)
Creates advanced devices with additional features.

11. SmartHomeController.java (Facade Pattern - Centralized Control)
Implements the Facade Pattern to simplify smart home control.
Provides centralized management of all devices.

12. LegacyDoorLockSystem.java (Legacy System)
A legacy door lock system that cannot be used directly with our SmartDevice interface.

13. DoorLockAdapter.java (Adapter Pattern - Converts Legacy System)
Adapter Pattern allows the old LegacyDoorLockSystem to be used like a SmartDevice.

14. SmartHomeDemo.java (Main Execution)
Creates devices, groups them, decorates them, and controls everything via the Facade.
Demonstrates how all the design patterns work together in the Smart Home Control System.

Conclusion
This implementation successfully uses 5 Design Patterns to build a structured, extensible Smart Home Control System. 
