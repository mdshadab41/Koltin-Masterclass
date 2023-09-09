fun main() {
    //val association = Pair<String,String>("Nail", "Hammer")
    //val association = "Nail" .to("Hammer")
    //val association = "Nail" to "Hammer"


//    println(association.first)
//    println(association.second)

//    val toolbox: Map<String,String> = mapOf(
//        "Nail" to " Hammer",
//        "Hex Nut" to " Wrench",
//        "Hex Bolt" to "Wrench",
//        "Slotted Screw" to "Slotted Screwdriver",
//        "Philips Screw" to "Philips Screwdriver"
//    )
//    val toolbox = mutableMapOf(
//        "Nail" to " Hammer",
//        "Hex Nut" to " Wrench",
//        "Hex Bolt" to "Wrench",
//        "Slotted Screw" to "Slotted Screwdriver",
//        "Philips Screw" to "Philips Screwdriver"
//    )
    //val tool = toolbox.get("Nail")
//    val tool = toolbox["Nail"]
    // val tool = toolbox.getValue("Nail")
    //val tool = toolbox.getOrDefault("Hanger Bolt", "Hand")
    // println(tool)
    //toolbox.put("Lumber", "Saw")
    //toolbox["Lumber"] = "Saw"

//    //update the value
//    toolbox["Hex Bolt"] = " Nut Driver "
//
//    //remove item
//
//    toolbox.remove("Lumber")
//
//    toolbox.remove("Philip Screw")
//    toolbox["Cross Recess Screw"] = "Philips Screwdriver"
//
//    println(toolbox)


    //IMMUTABLE MAP

//    var toolbox = mapOf(
//        "Nail" to "Hammer",
//        "Hex Nut" to "Wrench",
//        "Hex Bolt" to "Wrench",
//        "Slotted Screw" to "Slotted Screwdriver",
//        "Phillips Screw" to "Phillips Screwdriver",
//    )
//
//    //Add an entry
//    toolbox = toolbox + Pair("Lumber", "Saw")
//
//    //update an entry
//    toolbox = toolbox + Pair("Hex Bolt", "Nut Driver")
//
//    //Remove an entry
//    toolbox = toolbox - "Lumber"
//
//    //Simulate Changing a key
//
//    toolbox = toolbox - "Philips Screw"
//    toolbox = toolbox + Pair("Cross Recess Screw", "Phillips Screwdriver")
//
//    //MAP OPERATIONS
//
//    //forEach
//    toolbox.forEach{ entry ->
//        println("Use a ${entry.value} on a ${entry.key}")
//    }
//
//    //Filtering
//    val screwdrivers = toolbox.filter { entry ->
//        entry.value.contains("Screwdriver")
//    }
//   // println(screwdrivers)
//
//
//    //MAPPING
//     val newToolbox = toolbox
//         .mapKeys { entry -> entry.key.replace("Hex", "Flange") }
//         .mapValues { entry -> entry.value.replace("Wrench", "Ratchet") }

  //CREATING A MAP FROM A LIST

    class Tool(
        val name: String,
        val weightInOunces: Int,
        val correspondingHardware: String
    )

    val tools = listOf(
        Tool("Hammer", 14, "Nail"),
        Tool("Wrench", 8, "Hex Nut"),
        Tool("Wrench", 8, "Hex Bolt"),
        Tool("Slotted Screwdriver", 5, "Slotted Screw"),
        Tool("Phillips Screwdriver", 5, "Phillips Screw"),
    )

    val toolbox = tools.associate { tool ->
        tool.correspondingHardware to tool.name
    }

    val toolsByName = tools.associateBy { tool -> tool.name }

    val hammer = toolsByName["Hammer"]

    val toolWeightInPounds = tools.associateWith { tool ->
        tool.weightInOunces * 0.0625
    }

    val hammerWeightInPounds = toolWeightInPounds[hammer]

    //GROUPING LIST ELEMENTS INTO A MAP OF LISTS

    val toolsByWeight = tools.groupBy { tool ->
        tool.weightInOunces
    }
    val toolNameByWeight = tools.groupBy(
        {tool -> tool.weightInOunces},
        {tool -> tool.name}
    )
}