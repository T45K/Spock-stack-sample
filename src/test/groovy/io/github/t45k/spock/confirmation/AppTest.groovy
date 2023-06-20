package io.github.t45k.spock.confirmation

import spock.lang.Shared
import spock.lang.Specification

import java.nio.file.Path

class AppTest extends Specification {

    @Shared
    def IMAGE_PATH = Path.of('src/test/resources/large_image.jpg')

    def 'fast because test target will not be shown in test name'() {
        expect:
        App.calcImageSize(IMAGE_PATH.bytes) > 0
    }

    def 'this test will be completed soon because I limit the length of test name'() {
        expect:
        App.calcImageSize(image) > 0

        where:
        image << [IMAGE_PATH.bytes]
    }
}
