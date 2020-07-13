package model

class Camera{

    private var isOn: Boolean = false
    private var resolution: Int = 640
    private var brand: String? = null
    private var memory: Int = 4

    fun setMemory(memoria: Int){
        this.memory = memoria
    }

    fun getMemory(): Int{
        return this.memory
    }

    fun setBrand(marca: String){
        this.brand = marca
    }

    fun getBrand(): String?{
        return this.brand
    }

    fun setResolution(resolution: Int){
        this.resolution = resolution
    }

    fun getResolution(): Int{
        return this.resolution
    }

    fun turnOn (){
        isOn = true
    }

    fun turnOff (){
        isOn = false

    }

    fun getCameraStatus () :String{

        return if (isOn) "Camera is turned" else "Camera is not turned"
    }

    /**
     * fun setCameraStatus(status: boolean){
     * isOn = status
     * }
     *
     * Esta funcion no va en este caso ya que causaría redundancia con los métodos turnOn() y turnOff()
     *
     */
}