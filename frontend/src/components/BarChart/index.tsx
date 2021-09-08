import Chart from 'react-apexcharts';

const BarChart = () => {

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };

    const mockData = {
        labels: {
            categories: ['Cliente 1', 'Cliente 2', 'Cliente 3', 'Cliente 4', 'Cliente 5']
        },
        series: [
            {
                name: "% Sucesso",
                data: [63.6, 85.4, 57.5, 25.6, 45]
            }
        ]
    };

    return (
        <Chart 
            options={{ ...options, xaxis: mockData.labels}}
            series={mockData.series}
            type="bar"
            height="240"
        />
    );
}

export default BarChart;