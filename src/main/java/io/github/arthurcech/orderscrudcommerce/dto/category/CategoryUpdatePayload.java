package io.github.arthurcech.orderscrudcommerce.dto.category;

import io.github.arthurcech.orderscrudcommerce.service.validation.CategoryUpdateValid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@CategoryUpdateValid
public record CategoryUpdatePayload(
        @NotBlank(message = "Required field")
        @Size(min = 2, max = 255, message = "The field must have a minimum of 2 and a maximum of 255 characters")
        String name
) {
}
