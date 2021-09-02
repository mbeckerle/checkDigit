package com.owlcyberdefense.misc

import org.junit.AfterClass
import org.junit.Test

import org.apache.daffodil.tdml.Runner

object TestCheckDigit {
  lazy val runner = Runner("/com/owlcyberdefense/misc/", "TestCheckDigit.tdml")

  @AfterClass def shutDown {
    runner.reset
  }
}

class TestCheckDigit {

  import TestCheckDigit._

  @Test def test_checkDigit_01(): Unit = {
    runner.runOneTest("test_checkDigit_01")
  }
}
