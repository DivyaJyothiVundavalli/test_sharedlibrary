// vars/myPipeline.groovy
def call(String message = "Hello") {
    echo "${message}, from shared library!"
}
