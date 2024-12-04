#pragma once
#include "Target.h"

class Adapter:
  public Target{
    public:
      void Request() override;
  };
