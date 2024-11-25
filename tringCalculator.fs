module StringCalculator

let add (numbers: string) =
    match numbers with
    | "" -> 0
    | _ ->
        let delimiters = [| ','; '\n' |]
        let parts = numbers.Split(delimiters) |> Array.map int
        let negatives = parts |> Array.filter (fun x -> x < 0)
        if negatives.Length > 0 then
            failwithf "Negatives not allowed: %A" negatives
        parts |> Array.filter (fun x -> x >= 0) |> Array.sum

// Pruebas
printfn "%d" (add "1,2")       // 3
printfn "%d" (add "1,-2,-3")   // Excepción: "Negatives not allowed: [-2; -3]"




