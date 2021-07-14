#!/usr/bin/env bash

set -eo pipefail

modules=(config-server eureka-server review-service product-service )

for module in "${modules[@]}"; do
    docker build -t "${module}:latest" ${module}
done
