// Required due to JENKINS-27421

@NonCPS

List<List<?>> mapToList(Map map) {

  return map.collect { it ->

    [it.key, it.value]

  }

}
