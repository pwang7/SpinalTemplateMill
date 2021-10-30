package mylib

import org.scalatest.funsuite.AnyFunSuite

import spinal.core._
import spinal.core.sim._
import spinal.sim._

class MyTopLevelSimTest extends AnyFunSuite {
    test("Simulate") {
        SimConfig.withWave.compile(new MyTopLevel).doSim(MyTopLevelSim.simulate(_))
    }

    test("An empty Set should have size 0") {
        assert(Set.empty.size == 0)
    }

    test("Invoking head on an empty Set should produce NoSuchElementException") {
        assertThrows[NoSuchElementException] {
            Set.empty.head
        }
    }
}
