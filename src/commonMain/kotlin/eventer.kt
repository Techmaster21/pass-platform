// the actual event that requires a pass
data class Event(val name: String, val description: String, val passTemplate: PassTemplate)
// An eventer page. Can be managed by multiple people
data class Eventer(val name: String, val description: String, val events: List<Event>)
// people who manage the eventer page.
data class EventerUser(val username: String, val token: String, val eventers: List<Eventer>)

// TODO how do you decide for/again one to many or many to one? Like should eventers contain a list of events
//  or should events contain a reference to an eventer? One allows multiple eventers per event and one doesn't -
//  is that the only consideration?
// TODO am I structuring this all too much like it would look in a database and not enough like I would want to see it
//  in the front and backend? -- probably, yes
// look into https://github.com/JetBrains/Exposed