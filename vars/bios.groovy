class my_vars {
    static Map varMap = [:]
    static def loadVars (Map config) {
        varMap.var1 = "val1"
        varMap.var2 = "val2"
        varMap.var1 = "val3"
        varMap.var2 = "val4"
        // Many more variables ...

        return varMap
    }
}
