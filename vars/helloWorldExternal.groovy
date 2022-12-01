def call(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.sh')
    bat "./hello-world.sh ${config.name} ${config.dayOfWeek}"
}
