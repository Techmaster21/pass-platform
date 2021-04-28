# Design

## Main Stakeholders

### Eventers
The people that run the event. They want to create a pass unique to their event
that they can offer to people for a fee. They want these passes to expire after
the event is over.

### Eventees
People that want to go to the event. They want a simple way to obtain passes for
events, to admire the work eventers did to make them, and to keep them as digital
memorabilia. 

## UI
Want two separate UIs - one for eventers, one for eventees. Eventees should be the
main focus, as they will be the main users. However, it should not be confusing
to switch to the eventer UI.

### UI Functions

#### Eventers

* Eventers should be able to create a new pass.
* They should be able to limit how many passes there can be.
* They should be able to choose a price for each pass.
* They should be able to choose from a variety of pre-made designs, being able only
  to add some words in a pre-defined spot (like the event's title for instance). 
* They should be able to create their own design. There will be a simple built in
  designer, but most eventers will likely choose to create their design using a 
  different program and upload it. 
* There should be a variety of available shapes, such as square, rounded square,
  circle, oval, etc.
* They should have multiple ways to allow eventees to obtain passes each of which
  can be toggled on and off. For instance, in person, through NFC (This would 
  require an app, as WebNFC is only supported by Chrome on Android), or a QR code,
  remotely, through a search functionality, through a link to their event, etc.
* They should be able to set up their information for payments. Paypal, Apple Pay,
  Venmo, Stripe, or something to those effects. Payments should be managed through
  the app.
