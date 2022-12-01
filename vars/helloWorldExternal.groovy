def call(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.sh')
    bat "./hello-world.bat ${config.name} ${config.dayOfWeek}"
}
