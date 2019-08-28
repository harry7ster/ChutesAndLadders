If it was a real project:   (I have already included some deign flexibilty for if this was a real project)

- The user can encounter Ladders, and Chutes in the same move. For e.g. Chute: 24-10  , and Ladder: 10-40.
  So in the above case, the user comes down, and climbs up in the same move.
  I have coded the logic such that it will check for the ladders and chutes over and over until the number doesn't change


- The game can have an object in addition to Ladder, and Chute.
  Just as Ladder lands the player to a different number, this object can land the user to different number depending on the logic.
  For e.g. Lets say the new object is called "star".  Lets say number 42, and 51 has a star
  If the user lands on a star, and if the star is on a even number, it doubles the number. For e.g. 42 turns into 84.
  But if the user lands on a star that is on a odd number, the user goes down on a number (51 = 5+1 = 6)

  So , for adding new objects to the game (or new twists!!), i have made the design such that the programmer can add the actions to the framework, and those will be executed in the game along with chutes, and ladders.
  Each object needs to extend the abstract class "EntityAction", and then add the action by using "Actions.addToContext(EntityAction)"


- The game can have more details to the entities like Player (player rank etc), Chutes(shape, color etc). So i have created business object, so that the fields can be added as per the requirement
- When starting the game, the player with highest number starts the game. It can happen that two users get same high numbner, so we repeat the process until a single user gets hihest number, and then change the players sequence by putting that user in the front.