# Mediator-Pattern

Mediator is a behavioral design pattern. A mediator pattern defines an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets us vary their interaction independently.

When to use : When multiple objects need to interact with each other to process the request but direct communication may create a complex system, you can consider using mediator pattern.

Sample Scenario : GroupChat - When many participants need to discuss as a group, it is not a good idea to link each to every other participants. It makes the discussion clumsier and difficult to comprehend. So we use a mediator that takes the message from each participant and displays it in the ChatRoom. This improves the understandability and makes it easy to follow the discussion. We have created two classes - ChatRoom and User. In the main(), an object for User will be created which will call the method sendMessage(). The user's sendMessage() will inturn make a call to the ChatRoom's showMessage(). The message sent by the User will be displayed in the chatroom. 

