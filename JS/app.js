let tips = [
    "Pick the right location—ideally, a sunny site! Most vegetables need at least 6 hours of sun a day. Some crops such as lettuce and spinach, and other greens will grow well in your partially sunny spots, but sun-loving plants like tomatoes and peppers need as much light as possible.",
    "Keep it close to home. A location near your house will make it easier for you to tend your plot regularly and will also make it convenient to run out and pick what you need for a meal.",
    "Only grow things your family likes to eat.There is no sense in spending all your time and energy (and money) growing things you won’t enjoy or that will go to waste! Browse our library of Growing Guides to find veggies that spark your eye.",
    "Water needs to be readily available. Nothing burns out a beginning gardener faster than having to lug water to thirsty plants during a heat wave. Consider investing in a quality hose with a sprayer attachment or, even better, a drip irrigation system.",
    "Good soil is the key to a successful garden. Plants depend on the soil for nutrients, stability, and drainage. To grow your best garden, start with well-drained, sandy loam and add as much organic matter as possible. ",
    "Amend your soil.Compost, leaf mold, or well-aged manure will increase the ability of your soil to both drain well and hold moisture—the sponge factor. However, never use fresh manure! It can harbor dangerous pathogens and will burn tender plant roots. Compost it for at least 6 to 12 months."
]
function getTip(){
    let randomNumber = Math.floor(Math.random() * tips.length)
    document.getElementById('newTipSection').innerHTML = tips[randomNumber];
}