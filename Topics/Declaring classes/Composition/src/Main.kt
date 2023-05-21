class OperatingSystem {
    var name: String = "linux"
}

class DualBoot {
    var primaryOs: OperatingSystem = OperatingSystem()
    var secondaryOs: OperatingSystem = OperatingSystem()
}