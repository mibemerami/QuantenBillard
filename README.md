# QuantenBillard
A billard-game, but the bolws act like they are quarks.



Hello Felix,

For starting I thought of five rolls/actors using the application:
1 Developers; 2 Designers; 3 User/Gamers; 4 Students; 5 Managers.
And thus five main packages.
This first draft contains only the developers package which I called gameplay.

The package gameplay contains the the logical representation of the objects, you would also find in the real world
(for the grafical representation, I think we should use inhariting classes): 
The bowls, the queue, the table with cushions and holes. The table is kind of the root of these objects, and checks their 
positions, and by that finds out if there is an event. Gameplay has a subpackage called billardEvents that are events like 
collisions, or a bowl falls into one of the holes, and others. It has a baseclass which is amongst others nessesary, so that
the method, which handles the events, doesn't need to differentiate between the events by using if-statements, but just has 
to call the onEvent() method, which has to be implemented in every subclass of BillardEvent diffenrently. 
There is also the class GameEngine. It is thought to be the controller of the gameflow, it controlls the time and makes the 
decisions, if there are any. 
Then there are a few helper-classes: A few of them are datatypes like Position ore Impulse. The Clock is thought to help to 
do the timemanagement.To begin, I set the size of time-units to 30 milliseconds. The EventHelper is thought to create the 
appropriate events.

The whole draft is first of all just a draft, so feel free to make changes or suggestions (but also don't be to hard as I'm 
relativly new). Second of all it is mainly about the strucuture, many methods and classes are just filled with dummy-code. 
And third it is not comletet yet.   
