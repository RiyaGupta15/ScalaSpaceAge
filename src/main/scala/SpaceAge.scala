object SpaceAge extends App {
  def getAge(n:Double, seconds:Double):Double = Math.round(((seconds/31557600.0)/n)*100)/100.0
  def onEarth(seconds:Double):Double = getAge(1.0,seconds)
  def onMercury(seconds:Double):Double = getAge(0.2408467,seconds)
  def onVenus(seconds:Double):Double = getAge(0.61519726,seconds)
  def onMars(seconds:Double):Double = getAge(1.8808158,seconds)
  def onJupiter(seconds:Double):Double = getAge(11.862615,seconds)
  def onSaturn(seconds:Double):Double = getAge(29.447498,seconds)
  def onUranus(seconds:Double):Double = getAge(84.016846,seconds)
  def onNeptune(seconds:Double):Double = getAge(164.79132,seconds)
}